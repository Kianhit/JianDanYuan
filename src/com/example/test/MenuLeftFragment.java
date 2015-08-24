package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MenuLeftFragment extends Fragment {
	private View mView;
	private ListView mCategories;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (mView == null) {
			initView(inflater, container);
		}
		return mView;
	}

	private void initView(LayoutInflater inflater, ViewGroup container) {
		mView = inflater.inflate(R.layout.left_menu, container, false);
		mCategories = (ListView) mView
				.findViewById(R.id.id_listview_categories);
		SimpleAdapter adapter = new SimpleAdapter(this.getActivity(),
				getData(), R.layout.left_menu_items, new String[] { "title",
						"image" }, new int[] { R.id.title, R.id.image });
		mCategories.setAdapter(adapter);

	}

	// 该方法取得数据
	private List<Map<String, Object>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map;

		map = new HashMap<String, Object>();
		map.put("title", "电  影");
		map.put("image", R.drawable.ic_add_movie);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "说  说");
		map.put("image", R.drawable.ic_add_shuoshuo);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "记  事");
		map.put("image", R.drawable.ic_add_note);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "设  置");
		map.put("image", R.drawable.ic_action_settings);
		list.add(map);

		return list;
	}
}
