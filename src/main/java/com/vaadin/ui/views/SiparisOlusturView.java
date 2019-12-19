package com.vaadin.ui.views;

import com.vaadin.domain.Siparis;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.components.SiparisiTamamlaButton;

public class SiparisOlusturView extends HorizontalLayout {

    FormLayout formLayout;
    MasaView masaView;

    public SiparisOlusturView() {
            masaView = new MasaView();
            addComponent(masaView);

            formLayout = new FormLayout();
            addComponent(formLayout);

            buildFormLayout();

    }

    void buildFormLayout(){
        TextField idField = new TextField("Id");
        idField.setEnabled(false);
        formLayout.addComponent(idField);

        TextField nameField = new TextField("Name");
        formLayout.addComponent(nameField);

        SiparisiTamamlaButton saveButton = new SiparisiTamamlaButton();
        saveButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                Siparis siparis = new Siparis();
            }
        });
        formLayout.addComponent(saveButton);


    }
}

