package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerOfferProcedureInitiateInputModelProductInitializationInstanceRecord
 */
public class CRCustomerOfferProcedureInitiateInputModelProductInitializationInstanceRecord   {
  private String productInstanceReference = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304  bian-reference: CustomerOffer.OfferedAgreement (as Agreement).BankingProduct  general-info: Reference to a specific product instance if the offer is accepted and the product set-up initiated 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


}

