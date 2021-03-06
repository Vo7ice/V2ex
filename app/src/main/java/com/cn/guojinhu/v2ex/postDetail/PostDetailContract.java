package com.cn.guojinhu.v2ex.postDetail;


import android.view.View;

import com.cn.guojinhu.v2ex.Base.BasePresenter;
import com.cn.guojinhu.v2ex.Base.BaseView;
import com.cn.guojinhu.v2ex.data.Member;
import com.cn.guojinhu.v2ex.data.Post;
import com.cn.guojinhu.v2ex.data.Reply;

import java.util.List;

public class PostDetailContract {

    interface View extends BaseView<Presenter> {
        void showUI(Post post, Member mMember);

        android.view.View setHeadView();

        void replaceData(List<Reply> replyList);

        void showProgressbar(boolean needShow);

        void showSnackBar(int resId);

        int getHeaderVisibility();

        void showMemberDetailUI(Member member);
    }

    interface Presenter extends BasePresenter {
        void openMemberDetail(Member member);
    }
}
