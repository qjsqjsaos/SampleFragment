package org.techtown.samplefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MainFragment mainFragment;
    MenuFragment menuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mainFragment는 이미 activity_main.xml에 추가중인 상태라서 이런식으로 아이디를 바로 참조 하고, 메뉴프래그먼트는 바로 새로운 객체를 만든다.
        mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.mainFragment); //프래그먼트는 뷰가 아니라서
        //액티비티 클래스에 있는 findViewById 메서드로 찾을 수 없다. 대신 프래그먼트를 관리하는 프래그먼트매니저 객체에 findFragmentById 메서드를 사용해
        //찾은 후, 변수에 할당하고, 메뉴 프래그먼트는 new 연산자를 사용해 새로운 객체를 만들어 변수에 할당.
        menuFragment = new MenuFragment();
    }

    public void onFragmentChanged(int index) {
        if (index == 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,mainFragment).commit();
            //리플레이스 메서드가 프래그먼트를 바꾸도록 해줌. 여기서 R.id.container는 프래그먼트를 담고 있는 레이아웃 id 밑에도 마찬가지.
        }
        else if (index == 0) { //*트랜잭션을 사용하는 이유는 프래그먼트를 변경할 때 오류가 생기면 다시 원래상태로 돌릴 수 있어야 하기 때문이다.
            getSupportFragmentManager().beginTransaction().replace(R.id.container,menuFragment).commit();
            //beginTransaction은 트랜잭션을 시작하기 위한 메서드이고, commit은 트랜재션을 실행하기 위한 메서드이다.
        }
    }
}