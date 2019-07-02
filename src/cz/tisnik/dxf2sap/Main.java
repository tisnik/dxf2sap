/**
 * 
 */
package cz.tisnik.dxf2sap;

import cz.tisnik.dxf2sap.datamodel.DataModel;

/**
 * 
 * @author Pavel Tisnovsky
 */
public class Main
{
    public static void main(String[] args)
    {
        DataModel dataModel = new DataModel();
        MainWindow mainWindow = new MainWindow(dataModel);
        mainWindow.run();
    }
}

