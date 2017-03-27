package org.launchcode.models.forms;

import org.launchcode.models.JobFieldType;

/**
 * Created by LaunchCode
 */
public class SearchForm {

    private JobFieldType[] fields = JobFieldType.values();
    private JobFieldType searchField = JobFieldType.ALL;
    private String keyword;

    public JobFieldType getSearchField() {
        return searchField;
    }

    public void setSearchField(JobFieldType searchField) {
        this.searchField = searchField;
    }

    public JobFieldType[] getFields() {
        return fields;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
