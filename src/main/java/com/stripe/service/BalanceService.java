// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Balance;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.RequestOptions;
import com.stripe.param.BalanceRetrieveParams;

public class BalanceService extends ApiService {
  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="/docs/connect/account-balances#accounting-for-negative-balances">Accounting for negative
   * balances</a>.
   */
  public Balance retrieve(BalanceRetrieveParams params) throws StripeException {
    return retrieve(params, (RequestOptions) null);
  }

  /**
   * Retrieves the current account balance, based on the authentication that was used to make the
   * request. For a sample request, see <a
   * href="/docs/connect/account-balances#accounting-for-negative-balances">Accounting for negative
   * balances</a>.
   */
  public Balance retrieve(BalanceRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url = resourceUrl("/v1/balance");
    return request(ApiResource.RequestMethod.GET, url, params, Balance.class, options);
  }
}