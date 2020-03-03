package com.dapeng.flow.workhour.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dapeng.flow.common.result.ResponseData;
import com.dapeng.flow.workhour.dto.WorkHourDto;
import com.dapeng.flow.workhour.service.WorkHourService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/workhour")
@Api(value = "工時", tags = {"工時"})
public class WorkHourController {
	@Autowired
	private WorkHourService  workHourService;
	/**
	 * 
	 * @param hourDto
	 * @param bindingResult
	 * @return
	 */
    @PostMapping("/saveWorkHour")
    public ResponseData saveWorkHour(@Valid @RequestBody WorkHourDto hourDto,BindingResult bindingResult) {
        ResponseData  response= workHourService.saveWorkHour(hourDto);
        return response;
    }
	

}
