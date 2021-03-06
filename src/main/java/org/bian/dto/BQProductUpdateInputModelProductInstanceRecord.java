package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductUpdateInputModelProductInstanceRecord
 */
public class BQProductUpdateInputModelProductInstanceRecord   {
  private String productOption = null;

  private String productOptionDescription = null;

  private String productOptionSelection = null;

  private String productPricing = null;

  private String negotiationGuidelinesRules = null;

  private String agreedPricing = null;

  private String pricingAdjustments = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Product feature that can be configured for the customer 
   * @return productOption
  **/

  public String getProductOption() {
    return productOption;
  }

  public void setProductOption(String productOption) {
    this.productOption = productOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the feature provided for review 
   * @return productOptionDescription
  **/

  public String getProductOptionDescription() {
    return productOptionDescription;
  }

  public void setProductOptionDescription(String productOptionDescription) {
    this.productOptionDescription = productOptionDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The option setting as agreed/defined with the customer 
   * @return productOptionSelection
  **/

  public String getProductOptionSelection() {
    return productOptionSelection;
  }

  public void setProductOptionSelection(String productOptionSelection) {
    this.productOptionSelection = productOptionSelection;
  }


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FY1e9cTGEeChad0JzLk7QA_-1288627304/elements/_FY_P8MTGEeChad0JzLk7QA_-1890335916  bian-reference: CustomerOffer.OfferedAgreement(as Agreement).BankingProduct.BankingProductFeature (as PricingFeature)  general-info: The allowed pricing includes ranges by customer measures e.g. credit grade 
   * @return productPricing
  **/

  public String getProductPricing() {
    return productPricing;
  }

  public void setProductPricing(String productPricing) {
    this.productPricing = productPricing;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines for the allowed situation-based pricing adjustments (to maximize margins) 
   * @return negotiationGuidelinesRules
  **/

  public String getNegotiationGuidelinesRules() {
    return negotiationGuidelinesRules;
  }

  public void setNegotiationGuidelinesRules(String negotiationGuidelinesRules) {
    this.negotiationGuidelinesRules = negotiationGuidelinesRules;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The agreed pricing (covers all negotiable prices/fees/penalties as necessary) 
   * @return agreedPricing
  **/

  public String getAgreedPricing() {
    return agreedPricing;
  }

  public void setAgreedPricing(String agreedPricing) {
    this.agreedPricing = agreedPricing;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return pricingAdjustments
  **/

  public String getPricingAdjustments() {
    return pricingAdjustments;
  }

  public void setPricingAdjustments(String pricingAdjustments) {
    this.pricingAdjustments = pricingAdjustments;
  }


}

