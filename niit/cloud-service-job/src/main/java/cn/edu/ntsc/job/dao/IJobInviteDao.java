package cn.edu.ntsc.job.dao;

import org.springframework.stereotype.Repository;

import cn.edu.ntsc.job.domain.Job;

@Repository
/*
 * 添加招聘信息的dao
 */
public interface IJobInviteDao {
	public int addJobInvite(Job job);
}
