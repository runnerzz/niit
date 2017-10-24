package cn.edu.ntsc.job.service;

import java.util.List;

import cn.edu.ntsc.job.domain.Job;

/**
 * 招聘信息
 * 
 * @author Dora
 *
 */
public interface IJobService {
	/**
	 * 查看招聘信息的详情
	 */
	public Job getJobInfoByJobID(int jobID);
	
	public List<Job> getJobList();
}
