package com.vaadin.ui.components;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;

public class SiparisiTamamlaButton extends Button {

    public SiparisiTamamlaButton() {
        setIcon(FontAwesome.CHECK);
        setCaption("Kaydet");
    }
}
