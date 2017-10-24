package cn.edu.ntsc.job.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ntsc.job.dao.IJobDao;
import cn.edu.ntsc.job.domain.Job;
import cn.edu.ntsc.job.service.IJobService;
@Service
public class JobServiceImpl implements IJobService{
	@Autowired
	IJobDao dao;
	@Override
	public Job getJobInfoByJobID(int jobID) {
		// TODO 自动生成的方法存根
		return dao.getJobInfoByJobID(jobID);
	}
	public List<Job> getJobList(){
		// TODO 自动生成的方法存根
		return dao.getJobList();
	}

}
