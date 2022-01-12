package pub.developers.forum.api.service;

import pub.developers.forum.common.model.PageRequestModel;
import pub.developers.forum.common.model.PageResponseModel;
import pub.developers.forum.common.model.ResultModel;
import pub.developers.forum.common.request.faq.*;
import pub.developers.forum.common.response.faq.FaqHotsResponse;
import pub.developers.forum.common.response.faq.FaqInfoResponse;
import pub.developers.forum.common.response.faq.FaqUserPageResponse;

import java.util.List;

/**
 * @author Qiangqiang.Bian
 * @create 2020/11/1
 * @desc
 **/
public interface FaqApiService {

    ResultModel<Long> saveFaq(FaqSaveFaqRequest request);

    ResultModel<PageResponseModel<FaqUserPageResponse>> adminPage(PageRequestModel<FaqAdminPageRequest> pageRequestModel);

    ResultModel<PageResponseModel<FaqUserPageResponse>> userPage(PageRequestModel<FaqUserPageRequest> pageRequestModel);

    ResultModel<PageResponseModel<FaqUserPageResponse>> authorPage(PageRequestModel<FaqAuthorPageRequest> pageRequestModel);

    ResultModel<FaqInfoResponse> info(Long id);

    ResultModel<List<FaqHotsResponse>> hots(int size);

    ResultModel solution(FaqSolutionRequest request);
}
