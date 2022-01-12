package pub.developers.forum.api.service;

import pub.developers.forum.common.model.PageRequestModel;
import pub.developers.forum.common.model.PageResponseModel;
import pub.developers.forum.common.model.ResultModel;
import pub.developers.forum.common.request.AdminBooleanRequest;
import pub.developers.forum.common.request.config.ConfigAddRequest;
import pub.developers.forum.common.request.config.ConfigPageRequest;
import pub.developers.forum.common.request.config.ConfigUpdateRequest;
import pub.developers.forum.common.response.config.ConfigResponse;

import java.util.List;
import java.util.Set;

/**
 * @author Qiangqiang.Bian
 * @create 2020/12/26
 * @desc
 **/
public interface ConfigApiService {

    /**
     * 添加
     * @param request
     * @return
     */
    ResultModel add(ConfigAddRequest request);

    /**
     * 更新
     * @param request
     * @return
     */
    ResultModel update(ConfigUpdateRequest request);

    /**
     * 更新状态
     * @param request
     * @return
     */
    ResultModel state(AdminBooleanRequest request);

    /**
     * 分页查询
     * @param pageRequestModel
     * @return
     */
    ResultModel<PageResponseModel<ConfigResponse>> page(PageRequestModel<ConfigPageRequest> pageRequestModel);

    /**
     * 类别查询可用
     * @param types
     * @return
     */
    ResultModel<List<ConfigResponse>> queryAvailable(Set<String> types);
}
