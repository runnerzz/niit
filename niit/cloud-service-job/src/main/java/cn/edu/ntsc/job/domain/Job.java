package cn.edu.ntsc.job.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 招聘信息
 * 
 * @author Dora
 *
 */
@Data
public class Job implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 943275612278728291L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value="主键") 
	private int jobID;
	
	/**
	 * 公司名称
	 */
	@ApiModelProperty(value="公司名称") 
	private String jobCompanyName;
	
	/**
	 * 是否兼职
	 */
	@ApiModelProperty(value="是否兼职") 
	private int jobIsPartTime;
	
	/**
	 * 职位名称
	 */
	@ApiModelProperty(value="职位名称") 
	private String jobTitle;
	
	
	/**
	 * 职位描述
	 */
	@ApiModelProperty(value="职位描述") 
	private String jobDesc;
	
	/**
	 *学历要求
	 */
	@ApiModelProperty(value="学历要求") 
	private String jobDegree;
	
	/**
	 *性别要求
	 */
	@ApiModelProperty(value="性别要求") 
	private String jobSex;
	
	/**
	 *工作地点
	 */
	@ApiModelProperty(value="工作地点") 
	private String jobWorkAddress;
	
	/**
	 *薪资
	 */
	@ApiModelProperty(value="薪资") 
	private String jobSalary;
	
	/**
	 *人数
	 */
	@ApiModelProperty(value="人数") 
	private int jobEmpCount;
	
	/**
	 *联系方式
	 */
	@ApiModelProperty(value="联系方式") 
	private String jobContact;
	
	/**
	 *发布时间
	 */
	@ApiModelProperty(value="发布时间") 
	private Date jobPublishtTime;
	
	/**
	 *结束时间
	 */
	@ApiModelProperty(value="结束时间") 
	private Date jobExpireTime;
	
	/**
	 *备注
	 */
	@ApiModelProperty(value="备注") 
	private String jobRemarks;
	
	/**
	 *职务状态
	 */
	@ApiModelProperty(value="职务状态") 
	private int jobStatus;

}
