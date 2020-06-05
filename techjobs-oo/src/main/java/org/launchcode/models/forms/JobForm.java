package org.launchcode.models.forms;

import org.launchcode.models.CoreCompetency;
import org.launchcode.models.Employer;
import org.launchcode.models.Location;
import org.launchcode.models.PositionType;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobForm {

    @NotNull
    @Size(min=1, message = "Name may not be empty")
    private String name;
    public String getName() {
        return name;
    }
    public  ok() {
        @NotNull
        private ArrayList<Employer> employer-Id;
        @NotNull
        private ArrayList<Location> location-Id;
        @NotNull
        private ArrayList<CoreCompetency> skill-Id;
        @NotNull
        private ArrayList<PositionType> position-Type-Id;
    }
    /*3,4,5 easy !!!!!!!!!!!!!!!!!!!!!!!!!
            ****TODO #3 - Include other fields needed to create a job,
            with correct validation attributes and display names.
            Don't forget to add getters and setters
         */


    public JobForm() {

        JobData jobData = JobData.getInstance();

        /*
            TODO #4 - populate the other ArrayList collections needed in the view
        */
        locations = JobData.getLocations().findAll();
        employers = JobData.getEmployers().findAll();
        coreCompetencies =JobData.getCoreCompetencies().findAll();
        positionTypes= JobData.getPositionTypes().findAll();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<CoreCompetency> getCoreCompetencies() {
        return coreCompetencies;
    }

    public void setCoreCompetencies(ArrayList<CoreCompetency> coreCompetencies) {
        this.coreCompetencies = coreCompetencies;
    }

    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }

    public void setPositionTypes(ArrayList<PositionType> positionTypes) {
        this.positionTypes = positionTypes;
    }
}
