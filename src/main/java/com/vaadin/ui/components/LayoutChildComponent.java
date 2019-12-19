package com.vaadin.ui.components;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;


public class LayoutChildComponent extends VerticalLayout {

    public LayoutChildComponent(int masaNo, boolean masaDoluMu) {
        Label masaLabelAdi = new Label();
        Label masaLabelDurum = new Label();

        masaLabelAdi.setCaption("Masa" + masaNo);

        if(masaDoluMu == true){

            masaLabelDurum.setIcon(FontAwesome.CHECK);
            masaLabelDurum.addStyleName("green");

        }else {

            masaLabelDurum.setIcon(FontAwesome.TIMES);
            masaLabelDurum.addStyleName("red");

        }
        setSpacing(true);
        setMargin(true);

        addComponent(masaLabelAdi);
        addComponent(masaLabelDurum);
    }

}
