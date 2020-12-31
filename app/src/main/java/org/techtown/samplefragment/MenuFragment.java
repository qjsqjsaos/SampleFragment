package org.techtown.samplefragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       //레이아웃 인플레이터에서 인플레이트 메서드 사용이
        //가능하므로, 첫번째 파라미터는 xml레이아웃이 들어가고, 두번째는 레이아웃이 설정 될 뷰 그룹 객체가 되는데, 그 것이 바로 상위 레이아웃,
        //따라서 container객체에 전달하면 된다. 인플레이트 메서드를 호출하면 인플레이션이 진행되고, 결과로 뷰그룹 객체에 반환(return)한다.

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_menu,container,false);

        Button button = rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //인텐트를 할때는 안드로이드 시스템을 이용하지만, 프래그먼트는 액티비티에서 메서드를 호출해야 한다.
                MainActivity activity = (MainActivity) getActivity();// getActivity 메서드를 호출하면 프래그먼트가 올라가있는 액티비티가 어떤 건지 알 수 있다.
                activity.onFragmentChanged(1); //프래그먼트는 액티비티를 통해 띄워야하므로, 메인액티비티를 통해 띄우기 위해 이 메서드를 입력한 것.
            }// 인덱스에 0 아규먼트를 입력하여 메인액티비티가 뜰것이다.
        });
        return rootView;
    }
}