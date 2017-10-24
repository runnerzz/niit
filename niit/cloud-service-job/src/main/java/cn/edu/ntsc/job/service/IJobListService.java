package cn.edu.ntsc.job.service;

import java.util.List;

import cn.edu.ntsc.job.domain.Job;

/**
 * 招聘列表
 * 
 * @author fan_song
 *
 */
public interface IJobListService {
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
	public Job findByID (int jobID);
}
