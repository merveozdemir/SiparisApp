package com.vaadin.ui.components;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.views.MasaView;
import com.vaadin.ui.views.SiparisOlusturView;

public class SideBar extends VerticalLayout {

    private Header header;
    private Content content;

    private MenuButton siparisOlusturButton;
    private MenuButton siparisiOdeButton;
    private MenuButton siparisGuncelleButton;

    public SideBar(Header header, Content content) {

        this.header = header;
        this.content = content;

        setSpacing(true);
        setMargin(true);


        siparisOlusturButton = new MenuButton(FontAwesome.PLUS_SQUARE);
        siparisOlusturButton.setCaption("Sipariş Ekle");
        siparisOlusturButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {

            }
        });
        addComponent(siparisOlusturButton);

        siparisiOdeButton = new MenuButton(FontAwesome.LIST);
        siparisiOdeButton.setCaption("Kategori Listele");
        siparisiOdeButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                SiparisOlusturView siparisOlusturView =new SiparisOlusturView();
            }
        });
        addComponent(siparisiOdeButton);

        siparisGuncelleButton = new MenuButton(FontAwesome.PLUS_SQUARE);
        siparisGuncelleButton.setCaption("Sorun Ekle");
        siparisGuncelleButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {

            }
        });
        addComponent(siparisGuncelleButton);


    }
}
