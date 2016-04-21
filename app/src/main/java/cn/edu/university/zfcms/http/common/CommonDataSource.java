package cn.edu.university.zfcms.http.common;

import cn.edu.university.zfcms.base.func.BaseDataSource;

/**
 * Created by hjw on 16/4/20.
 */
public interface CommonDataSource extends BaseDataSource {
    public interface RefreshViewStateCallback {
        void onRefreshData(String... stateParam);

        void onRefreshError(String msg);
    }

    public interface IOpCallback {
        void onResp(String... msg);

        void onError(String errMsg);
    }

    public void refreshLoginViewState(RefreshViewStateCallback callback);

    public void refreshMainViewState(String userId, RefreshViewStateCallback callback);
}
