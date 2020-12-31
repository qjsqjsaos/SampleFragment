package org.techtown.samplefragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_menu, container, false); //레이아웃 인플레이터에서 인플레이트 메서드 사용이
        //가능하므로, 첫번째 파라미터는 xml레이아웃이 들어가고, 두번째는 레이아웃이 설정 될 뷰 그룹 객체가 되는데, 그 것이 바로 상위 레이아웃,
        //따라서 container객체에 전달하면 된다. 인플레이트 메서드를 호출하면 인플레이션이 진행되고, 결과로 뷰그룹 객체에 반환(return)한다.
    }
}