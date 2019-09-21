package org.launchcode.controllers;

import org.launchcode.models.forms.JobForm;
import org.launchcode.models.data.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping(value = "job")
public class JobController {

    private JobData jobData = JobData.getInstance();

    // The detail display for a given Job at URLs like /job?id=17
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model, int id) {
        Job job = JobData.findById(id);
        model.addAttribute("job",job);

        // ****TODO #1 - get the Job with the given ID and pass it into the view

        return "job-detail";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute(new JobForm());
        return "new-job";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Model model, @Valid JobForm jobForm, Errors errors) {
        if (errors.hasErrors()){
            model.addAttribute("name","name");
            model.addAttribute("job",new Job());
            return "new-job";
        }
        // TODO #6 - Relates to TODO-5
        //
        //  Validate the JobForm model,
        //
        // if valid, create a new Job and add it to the jobData data store.
        //
        // Then redirect to the job detail view for the new Job.

        return "";

    }
}
