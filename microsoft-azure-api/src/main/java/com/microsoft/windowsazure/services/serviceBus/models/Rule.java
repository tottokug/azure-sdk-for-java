package com.microsoft.windowsazure.services.serviceBus.models;

import javax.ws.rs.core.MediaType;

import com.microsoft.windowsazure.services.serviceBus.implementation.Content;
import com.microsoft.windowsazure.services.serviceBus.implementation.Entry;
import com.microsoft.windowsazure.services.serviceBus.implementation.EntryModel;
import com.microsoft.windowsazure.services.serviceBus.implementation.RuleDescription;

public class Rule extends EntryModel<RuleDescription> {

    public Rule() {
        super(new Entry(), new RuleDescription());
        getEntry().setContent(new Content());
        getEntry().getContent().setType(MediaType.APPLICATION_XML);
        getEntry().getContent().setRuleDescription(getModel());
    }

    public Rule(Entry entry) {
        super(entry, entry.getContent().getRuleDescription());
    }

    public Rule(String name) {
        this();
        setName(name);
    }

    public String getName() {
        return getEntry().getTitle();
    }

    public Rule setName(String value) {
        getEntry().setTitle(value);
        return this;
    }
}
