package cn.edu.ntsc.job.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import cn.edu.ntsc.job.domain.Job;
/**
 * 招聘信息
 * 
 * @author Dora
 *
 */
@Repository
public interface IJobDao {
	/**
	 * 根据jobID查看招聘信息的详情
	 */
	public Job getJobInfoByJobID(int jobID);
	
	public List<Job> getJobList();
}
