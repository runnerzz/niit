package cn.edu.ntsc.job.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ntsc.job.dao.IJobListDao;
import cn.edu.ntsc.job.domain.Job;
import cn.edu.ntsc.job.service.IJobListService;

@Service
public class JobListServiceImpl implements IJobListService{
     @Autowired
     IJobListDao dao;
     @Override
 	/**
 	 * 查询所有的职位
 	 *
 	 */
 	public List<Job> findAllJob(){
    	 return dao.findAllJob();
     }
 	
 	/**
 	 * 根据JobID查询招聘信息
 	 * @param jobID
 	 * @return
 	 */
 	public Job findByID (int jobID){
 		return dao.getJobInfoByJobID(jobID);
 	}
     
	  
}
