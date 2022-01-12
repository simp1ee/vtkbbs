package pub.developers.forum.facade.impl;

import org.springframework.stereotype.Service;
import pub.developers.forum.common.model.PageRequestModel;
import pub.developers.forum.common.model.PageResponseModel;
import pub.developers.forum.common.model.ResultModel;
import pub.developers.forum.api.service.SearchApiService;
import pub.developers.forum.common.vo.PostsVO;
import pub.developers.forum.app.manager.SearchManager;
import pub.developers.forum.facade.support.ResultModelUtil;
import pub.developers.forum.facade.validator.PageRequestModelValidator;

import javax.annotation.Resource;

/**
 * @author Qiangqiang.Bian
 * @create 2020/12/2
 * @desc
 **/
@Service
public class SearchApiServiceImpl implements SearchApiService {

    @Resource
    private SearchManager searchManager;

    @Override
    public ResultModel<PageResponseModel<PostsVO>> pagePostsSearch(PageRequestModel<String> pageRequestModel) {
        PageRequestModelValidator.validator(pageRequestModel);

        return ResultModelUtil.success(searchManager.pagePostsSearch(pageRequestModel));
    }

}
