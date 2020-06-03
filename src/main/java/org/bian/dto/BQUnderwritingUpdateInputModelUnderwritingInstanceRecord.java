package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQUnderwritingUpdateInputModelUnderwritingInstanceRecord
 */
public class BQUnderwritingUpdateInputModelUnderwritingInstanceRecord   {
  private String customerIncomeStatement = null;

  private String customerDebtStatement = null;

  private String customerAssetStatement = null;

  private String underwritingAssessmentReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A statement of income over a required duration in a suitable format 
   * @return customerIncomeStatement
  **/

  public String getCustomerIncomeStatement() {
    return customerIncomeStatement;
  }

  public void setCustomerIncomeStatement(String customerIncomeStatement) {
    this.customerIncomeStatement = customerIncomeStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The provided debt statements may combine bank and non-bank managed debt details 
   * @return customerDebtStatement
  **/

  public String getCustomerDebtStatement() {
    return customerDebtStatement;
  }

  public void setCustomerDebtStatement(String customerDebtStatement) {
    this.customerDebtStatement = customerDebtStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The provided asset statement may combine bank and known non-bank managed assets 
   * @return customerAssetStatement
  **/

  public String getCustomerAssetStatement() {
    return customerAssetStatement;
  }

  public void setCustomerAssetStatement(String customerAssetStatement) {
    this.customerAssetStatement = customerAssetStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The outcome of the underwriting assessment 
   * @return underwritingAssessmentReference
  **/

  public String getUnderwritingAssessmentReference() {
    return underwritingAssessmentReference;
  }

  public void setUnderwritingAssessmentReference(String underwritingAssessmentReference) {
    this.underwritingAssessmentReference = underwritingAssessmentReference;
  }


}

