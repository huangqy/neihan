package com.north.neihan.fragment;

import java.util.ArrayList;
import java.util.List;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.north.neihan.R;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class EssayFragment extends Fragment implements OnClickListener,
		OnScrollListener, OnRefreshListener2<ListView> {

	private View quickTool, quickPublish, quickReview;
	private TextView notifyTextView;
	private ListView listView;
	private View header;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment_essay, container, false);

		TextView titleView = (TextView) view.findViewById(R.id.essay_title);
		titleView.setOnClickListener(this);

		List<String> strings = new ArrayList<String>();
		for (int i = 0; i < 50; i++) {
			strings.add("Java" + i);
		}

		// TODO 获取 LIstView控件，后期使用 PullToRefresh完善
		PullToRefreshListView pullToRefreshListView = (PullToRefreshListView) view
				.findViewById(R.id.essay_listview);

		pullToRefreshListView.setOnRefreshListener(this);
		pullToRefreshListView.setMode(Mode.BOTH);

		// listView = (ListView) view.findViewById(R.id.essay_listview);
		listView = pullToRefreshListView.getRefreshableView();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, strings);

		// TODO 添加列表的标头
		header = inflater.inflate(R.layout.essay_header_tools, listView, false);
		listView.addHeaderView(header);

		quickPublish = header.findViewById(R.id.quick_tools_publish);
		quickPublish.setOnClickListener(this);

		quickReview = header.findViewById(R.id.quick_tools_review);
		quickReview.setOnClickListener(this);

		// TODO 获取快速的工具条（发布和审核），用于列表滚动显示和隐藏

		quickTool = view.findViewById(R.id.essay_quick_tools);
		quickTool.setVisibility(View.INVISIBLE);

		quickPublish = quickTool.findViewById(R.id.quick_tools_publish);
		quickPublish.setOnClickListener(this);

		quickReview = quickTool.findViewById(R.id.quick_tools_review);
		quickReview.setOnClickListener(this);

		// TODO 获取新条目通知控件，每次有新数据都会显示，一定时间后隐藏
		notifyTextView = (TextView) view.findViewById(R.id.essay_new_notify);
		notifyTextView.setVisibility(View.INVISIBLE);

		listView.setOnScrollListener(this);
		listView.setAdapter(adapter);

		return view;
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		super.onDestroyView();
	}

	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			int what = msg.what;
			if (what == 1) {
				notifyTextView.setVisibility(View.INVISIBLE);
			}
		}
	};

	// ////////////////////////////////////////////////////////////////

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int id = v.getId();

		switch (id) {
		case R.id.essay_title:
			notifyTextView.setVisibility(View.VISIBLE);
			handler.sendEmptyMessageDelayed(1, 3000);
			break;
		}
	}

	// ////////////////////////////////////////////////////////////////

	private int lastIndex = 0;

	@Override
	public void onScroll(AbsListView view, int firstVisibleItem,
			int visibleItemCount, int totalItemCount) {
		int offset = lastIndex - firstVisibleItem;
		if (offset < 0 || firstVisibleItem == 0) {
			if (quickTool != null)
				quickTool.setVisibility(View.INVISIBLE);
		} else if (offset > 0) {
			if (quickTool != null) {
				quickTool.setVisibility(View.VISIBLE);
			}
		}

		lastIndex = firstVisibleItem;
	}

	@Override
	public void onScrollStateChanged(AbsListView view, int scrollState) {
		// TODO Auto-generated method stub

	}

	
	//////////////////////////////////////////////////////////////////

	@Override
	public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
		// TODO Auto-generated method stub

	}

}
