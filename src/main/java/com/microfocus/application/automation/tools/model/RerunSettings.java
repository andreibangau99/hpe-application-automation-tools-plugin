package com.microfocus.application.automation.tools.model;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

import javax.annotation.Nonnull;

public class RerunSettings extends AbstractDescribableImpl<RerunSettings> {
    private String test;
    private Boolean checked;
    private Integer numberOfReruns;
    private String cleanupTest;

    @DataBoundConstructor
    public RerunSettings(String test, Boolean checked, Integer numberOfReruns, String cleanupTest) {
        this.test = test;
        this.checked = checked;
        this.numberOfReruns = numberOfReruns;
        this.cleanupTest = cleanupTest;
    }

    public String getTest() {
        return test;
    }

    @DataBoundSetter
    public void setTest(String test) {
        this.test = test;
    }

    public Boolean getChecked() {
        return checked;
    }

    @DataBoundSetter
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Integer getNumberOfReruns() {
        return numberOfReruns;
    }

    @DataBoundSetter
    public void setNumberOfReruns(Integer numberOfReruns) {
        this.numberOfReruns = numberOfReruns;
    }

    public String getCleanupTest() {
        return cleanupTest;
    }

    @DataBoundSetter
    public void setCleanupTest(String cleanupTest) {
        this.cleanupTest = cleanupTest;
    }

    @Override
    public Descriptor<RerunSettings> getDescriptor() {
        return null;
    }

    @Extension
    public static class DescriptorImpl extends Descriptor<RerunSettings> {
        @Nonnull
        public String getDisplayName() {return "Rerun settings test model";}
    }
}
