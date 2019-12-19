package com.vaadin.ui.views;

import com.vaadin.domain.Masa;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.components.LayoutChildComponent;

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

                Label label=new Label();
                label.setValue("Masa" + count);
                LayoutChildComponent child = new LayoutChildComponent(count, false);
                mainGridLayout.addComponent(child);
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
