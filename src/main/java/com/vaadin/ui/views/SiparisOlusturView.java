package com.vaadin.ui.views;

import com.vaadin.domain.AnaYemek;
import com.vaadin.domain.Corba;
import com.vaadin.domain.Siparis;
import com.vaadin.domain.Tatli;
import com.vaadin.ui.*;
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

        Corba corba = new Corba("Mercimek", 5);
        Corba corba2 = new Corba("Ezogelin", 6);
        ComboBox corbaComboBox = new ComboBox();
        corbaComboBox.addItem(corba);
        corbaComboBox.addItem(corba2);
        formLayout.addComponent(corbaComboBox);

        TextField corbaAdetField = new TextField("Çorba Adet");
        formLayout.addComponent(corbaAdetField);

        AnaYemek yemek1 = new AnaYemek("Pilav", 10);
        AnaYemek yemek2 = new AnaYemek("Kuru Fasulye", 8);
        ComboBox anaYemekComboBox = new ComboBox();
        anaYemekComboBox.addItem(yemek1);
        anaYemekComboBox.addItem(yemek2);
        formLayout.addComponent(anaYemekComboBox);

        TextField anaYemekAdetField = new TextField("Ana Yemek Adet");
        formLayout.addComponent(anaYemekAdetField);

        Tatli tatli = new Tatli("Kazandibi", 7);
        Tatli tatli2 = new Tatli("Sütlaç", 7);
        ComboBox tatliComboBox = new ComboBox();
        tatliComboBox.addItem(tatli);
        tatliComboBox.addItem(tatli2);
        formLayout.addComponent(tatliComboBox);

        TextField tatliAdetField = new TextField("Tatlı Adet");
        formLayout.addComponent(tatliAdetField);

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

