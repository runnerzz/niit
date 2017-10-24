package cn.edu.ntsc.job.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ntsc.job.dao.IJobInviteDao;
import cn.edu.ntsc.job.domain.Job;
import cn.edu.ntsc.job.service.IJobInviteService;

@Service
public class JobInviteSeiviiceImpl implements IJobInviteService {
	@Autowired
	IJobInviteDao dao;

	@Override
	public int addJobInvite(Job job) {

		return dao.addJobInvite(job);
	}

}
