package com.vaadin.ui.views;

import com.vaadin.domain.Masa;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;

import java.util.ArrayList;
import java.util.List;


public class MasaView extends GridLayout {

    private GridLayout mainGridLayout;
    private List<Masa> masaList = new ArrayList<>();

    public MasaView() {

        mainGridLayout = new GridLayout();
        mainGridLayout.addStyleName("Masa Düzeni");
        mainGridLayout.setSizeFull();
        generateMatrixGrid(3,2);


        addComponent(mainGridLayout);

    }

    private void generateMatrixGrid(final int rows, final int columns) {
        mainGridLayout.removeAllComponents();
        mainGridLayout.setRows(rows);
        mainGridLayout.setColumns(columns);

        int count = 1;
        for (int row = 0; row < mainGridLayout.getRows(); row++) {
            for (int col = 0; col < mainGridLayout.getColumns(); col++) {
              //  final LayoutChildComponent child = new LayoutChildComponent(mainGridLayout, false);
                Label label=new Label();
                label.setValue("Masa" + count);
                mainGridLayout.addComponent(label, col, row );
                mainGridLayout.setRowExpandRatio(row, 0.0f);
                mainGridLayout.setColumnExpandRatio(col, 0.0f);
                count++;

                Masa masa = new Masa();
                masa.setMasaNo(count);
                masa.setDolu(false);
                masaList.add(masa);
            }
        }


    }

}
