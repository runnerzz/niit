package cn.edu.ntsc.job.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.edu.ntsc.job.domain.Job;
@Repository
public interface IJobListDao {
	/**
	 * 查询所有的职位
	 *
	 */
	public List<Job> findAllJob();
	
	/**
	 * 根据JobID查询招聘信息
	 * @param jobID
	 * @return
	 */
	public Job getJobInfoByJobID (int jobID);
	
	
	/**
	 * 根据职位标题查询招聘信息
	 * @param jobTitile
	 * @return
	 */
	public Job getJobListByjobTitle (String jobTitile);
	
}
