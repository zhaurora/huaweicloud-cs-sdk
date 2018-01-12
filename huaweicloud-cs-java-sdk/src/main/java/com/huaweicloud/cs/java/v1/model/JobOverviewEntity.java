/*
 * CloudStream Service API
 * 实时流计算服（CloudStream Service，简称CS），是运行在华为云上的实时流式大数据分析服务，完全托管的方式让用户无需感知计算集群，只需聚焦于Stream SQL业务，即时执行作业，完全兼容Apache Flink API。
 *
 * OpenAPI spec version: 1.0.0
 * Contact: CloudStream@huawei.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huaweicloud.cs.java.v1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 作业概要统计信息实体
 */
@ApiModel(description = "作业概要统计信息实体")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-12T18:34:48.675+08:00")
public class JobOverviewEntity {
  @SerializedName("total_jobs")
  private Integer totalJobs = null;

  @SerializedName("running_jobs_count")
  private Integer runningJobsCount = null;

  @SerializedName("finished_job_count")
  private Integer finishedJobCount = null;

  @SerializedName("exception_job_count")
  private Integer exceptionJobCount = null;

  @SerializedName("running_job_charge")
  private Integer runningJobCharge = null;

  @SerializedName("running_job_price")
  private Integer runningJobPrice = null;

  @SerializedName("running_job_total_spu")
  private Integer runningJobTotalSpu = null;

  @SerializedName("running_job_total_time")
  private Integer runningJobTotalTime = null;

  /**
   * 结算币种
   */
  @JsonAdapter(BillingUnitEnum.Adapter.class)
  public enum BillingUnitEnum {
    CNY("CNY"),
    
    HKD("HKD"),
    
    EUR("EUR"),
    
    DEM("DEM"),
    
    USD("USD");

    private String value;

    BillingUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BillingUnitEnum fromValue(String text) {
      for (BillingUnitEnum b : BillingUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BillingUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BillingUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BillingUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BillingUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("billing_unit")
  private BillingUnitEnum billingUnit = null;

  /**
   * 时间单位
   */
  @JsonAdapter(TimeUnitEnum.Adapter.class)
  public enum TimeUnitEnum {
    HOUR("HOUR");

    private String value;

    TimeUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeUnitEnum fromValue(String text) {
      for (TimeUnitEnum b : TimeUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TimeUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TimeUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("time_unit")
  private TimeUnitEnum timeUnit = null;

  public JobOverviewEntity totalJobs(Integer totalJobs) {
    this.totalJobs = totalJobs;
    return this;
  }

   /**
   * 作业总数
   * @return totalJobs
  **/
  @ApiModelProperty(example = "100", value = "作业总数")
  public Integer getTotalJobs() {
    return totalJobs;
  }

  public void setTotalJobs(Integer totalJobs) {
    this.totalJobs = totalJobs;
  }

  public JobOverviewEntity runningJobsCount(Integer runningJobsCount) {
    this.runningJobsCount = runningJobsCount;
    return this;
  }

   /**
   * 运行的作业总数
   * @return runningJobsCount
  **/
  @ApiModelProperty(example = "100", value = "运行的作业总数")
  public Integer getRunningJobsCount() {
    return runningJobsCount;
  }

  public void setRunningJobsCount(Integer runningJobsCount) {
    this.runningJobsCount = runningJobsCount;
  }

  public JobOverviewEntity finishedJobCount(Integer finishedJobCount) {
    this.finishedJobCount = finishedJobCount;
    return this;
  }

   /**
   * 已完成的作业总数
   * @return finishedJobCount
  **/
  @ApiModelProperty(example = "100", value = "已完成的作业总数")
  public Integer getFinishedJobCount() {
    return finishedJobCount;
  }

  public void setFinishedJobCount(Integer finishedJobCount) {
    this.finishedJobCount = finishedJobCount;
  }

  public JobOverviewEntity exceptionJobCount(Integer exceptionJobCount) {
    this.exceptionJobCount = exceptionJobCount;
    return this;
  }

   /**
   * 运行异常的作业总数
   * @return exceptionJobCount
  **/
  @ApiModelProperty(example = "100", value = "运行异常的作业总数")
  public Integer getExceptionJobCount() {
    return exceptionJobCount;
  }

  public void setExceptionJobCount(Integer exceptionJobCount) {
    this.exceptionJobCount = exceptionJobCount;
  }

  public JobOverviewEntity runningJobCharge(Integer runningJobCharge) {
    this.runningJobCharge = runningJobCharge;
    return this;
  }

   /**
   * 正在运行的作业总费用
   * @return runningJobCharge
  **/
  @ApiModelProperty(example = "100", value = "正在运行的作业总费用")
  public Integer getRunningJobCharge() {
    return runningJobCharge;
  }

  public void setRunningJobCharge(Integer runningJobCharge) {
    this.runningJobCharge = runningJobCharge;
  }

  public JobOverviewEntity runningJobPrice(Integer runningJobPrice) {
    this.runningJobPrice = runningJobPrice;
    return this;
  }

   /**
   * 正在运行的作业单价合计
   * @return runningJobPrice
  **/
  @ApiModelProperty(example = "100", value = "正在运行的作业单价合计")
  public Integer getRunningJobPrice() {
    return runningJobPrice;
  }

  public void setRunningJobPrice(Integer runningJobPrice) {
    this.runningJobPrice = runningJobPrice;
  }

  public JobOverviewEntity runningJobTotalSpu(Integer runningJobTotalSpu) {
    this.runningJobTotalSpu = runningJobTotalSpu;
    return this;
  }

   /**
   * 正在运行的作业消耗SPU总数
   * @return runningJobTotalSpu
  **/
  @ApiModelProperty(example = "100", value = "正在运行的作业消耗SPU总数")
  public Integer getRunningJobTotalSpu() {
    return runningJobTotalSpu;
  }

  public void setRunningJobTotalSpu(Integer runningJobTotalSpu) {
    this.runningJobTotalSpu = runningJobTotalSpu;
  }

  public JobOverviewEntity runningJobTotalTime(Integer runningJobTotalTime) {
    this.runningJobTotalTime = runningJobTotalTime;
    return this;
  }

   /**
   * 正在运行的作业总时长
   * @return runningJobTotalTime
  **/
  @ApiModelProperty(example = "100", value = "正在运行的作业总时长")
  public Integer getRunningJobTotalTime() {
    return runningJobTotalTime;
  }

  public void setRunningJobTotalTime(Integer runningJobTotalTime) {
    this.runningJobTotalTime = runningJobTotalTime;
  }

  public JobOverviewEntity billingUnit(BillingUnitEnum billingUnit) {
    this.billingUnit = billingUnit;
    return this;
  }

   /**
   * 结算币种
   * @return billingUnit
  **/
  @ApiModelProperty(example = "CNY", value = "结算币种")
  public BillingUnitEnum getBillingUnit() {
    return billingUnit;
  }

  public void setBillingUnit(BillingUnitEnum billingUnit) {
    this.billingUnit = billingUnit;
  }

  public JobOverviewEntity timeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * 时间单位
   * @return timeUnit
  **/
  @ApiModelProperty(example = "HOUR", value = "时间单位")
  public TimeUnitEnum getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobOverviewEntity jobOverviewEntity = (JobOverviewEntity) o;
    return Objects.equals(this.totalJobs, jobOverviewEntity.totalJobs) &&
        Objects.equals(this.runningJobsCount, jobOverviewEntity.runningJobsCount) &&
        Objects.equals(this.finishedJobCount, jobOverviewEntity.finishedJobCount) &&
        Objects.equals(this.exceptionJobCount, jobOverviewEntity.exceptionJobCount) &&
        Objects.equals(this.runningJobCharge, jobOverviewEntity.runningJobCharge) &&
        Objects.equals(this.runningJobPrice, jobOverviewEntity.runningJobPrice) &&
        Objects.equals(this.runningJobTotalSpu, jobOverviewEntity.runningJobTotalSpu) &&
        Objects.equals(this.runningJobTotalTime, jobOverviewEntity.runningJobTotalTime) &&
        Objects.equals(this.billingUnit, jobOverviewEntity.billingUnit) &&
        Objects.equals(this.timeUnit, jobOverviewEntity.timeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalJobs, runningJobsCount, finishedJobCount, exceptionJobCount, runningJobCharge, runningJobPrice, runningJobTotalSpu, runningJobTotalTime, billingUnit, timeUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobOverviewEntity {\n");
    
    sb.append("    totalJobs: ").append(toIndentedString(totalJobs)).append("\n");
    sb.append("    runningJobsCount: ").append(toIndentedString(runningJobsCount)).append("\n");
    sb.append("    finishedJobCount: ").append(toIndentedString(finishedJobCount)).append("\n");
    sb.append("    exceptionJobCount: ").append(toIndentedString(exceptionJobCount)).append("\n");
    sb.append("    runningJobCharge: ").append(toIndentedString(runningJobCharge)).append("\n");
    sb.append("    runningJobPrice: ").append(toIndentedString(runningJobPrice)).append("\n");
    sb.append("    runningJobTotalSpu: ").append(toIndentedString(runningJobTotalSpu)).append("\n");
    sb.append("    runningJobTotalTime: ").append(toIndentedString(runningJobTotalTime)).append("\n");
    sb.append("    billingUnit: ").append(toIndentedString(billingUnit)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
