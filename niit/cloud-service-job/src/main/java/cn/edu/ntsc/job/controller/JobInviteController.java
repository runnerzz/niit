package cn.edu.ntsc.job.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.edu.ntsc.job.domain.Job;
import cn.edu.ntsc.job.service.IJobInviteService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController

public class JobInviteController {
	@Resource
	private IJobInviteService service;		
	@ApiOperation(value="查看招聘邀请信息", notes="查看招聘邀请信息")
    @ApiImplicitParam(name = "job", value = "Job实体类", required = true, dataType = "String")
	@RequestMapping(value = "/api/JobInviteInfo/data", method = RequestMethod.GET)
	public int addJobInviteInfo(@Valid Job job, BindingResult bindingResult) {
		return service.addJobInvite(job);
	}
}
