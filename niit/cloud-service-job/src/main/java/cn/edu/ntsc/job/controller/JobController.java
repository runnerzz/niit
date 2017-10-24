package cn.edu.ntsc.job.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.ntsc.job.domain.Job;
import cn.edu.ntsc.job.service.IJobService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class JobController {
	@Resource
	 IJobService service;
	/**
	 * 查看招聘信息的详情
	 */
	@ApiOperation(value="查看招聘信息的详情", notes="查看招聘信息的详情")
    @ApiImplicitParam(name = "jobID", value = "工作ID", required = true, dataType = "String")
	@RequestMapping(value="/api/job/showJob",method=RequestMethod.GET)
	public Job getJobInfoByJobID(@RequestParam(value="jobID",required=true) int jobID) {
		return service.getJobInfoByJobID(jobID);
	}
	/**
	 * 查看所有招聘信息的详情
	 */
	@ApiOperation(value="查看所有招聘信息的详情", notes="查看所有招聘信息的详情")
	@RequestMapping(value="/api/job/jobList",method=RequestMethod.GET)
	public List<Job> getJobList(){
   		return service.getJobList();
   	}
}
