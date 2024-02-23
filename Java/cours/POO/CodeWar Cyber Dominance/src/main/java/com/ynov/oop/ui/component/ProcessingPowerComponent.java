package com.ynov.oop.ui.component;

import jexer.TLabel;
import jexer.TWindow;

public class ProcessingPowerComponent extends TLabel {

    public ProcessingPowerComponent(TWindow window, int x, int y, int processingPowerValue) {
        super(window, String.format("Processing Power: %d",processingPowerValue),x,y);
    }
}
