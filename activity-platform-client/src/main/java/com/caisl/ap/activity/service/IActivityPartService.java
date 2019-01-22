package com.caisl.ap.activity.service;

import com.caisl.ap.activity.domain.Result;
import com.caisl.ap.activity.request.NewCustomerPartRequest;
import com.caisl.ap.activity.response.NewCustomerPartResponse;

/**
 * IActivityPartService
 *
 * @author shinan
 * @since 2019-01-22
 */
public interface IActivityPartService {
    /**
     * 参与新人有礼活动
     *
     * @param request
     * @return
     */
    Result<NewCustomerPartResponse> partNewCustomerActivity(NewCustomerPartRequest request);

}
