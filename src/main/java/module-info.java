module Viewer3D {
    requires java.desktop;
    requires java.logging;
    requires java.xml;

    requires javafx.swing;
    requires transitive javafx.base;
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires transitive javafx.graphics;

    opens com.javafx.experiments.jfx3dviewer to javafx.fxml, javafx.graphics;

    provides com.javafx.experiments.importers.Importer with
        com.javafx.experiments.importers.dae.DaeImporter,
        com.javafx.experiments.importers.max.MaxLoader,
        com.javafx.experiments.importers.maya.MayaImporter,
        com.javafx.experiments.importers.obj.ObjOrPolyObjImporter;

    exports com.javafx.experiments.exporters.fxml;
    exports com.javafx.experiments.exporters.javasource;
    exports com.javafx.experiments.importers;
    exports com.javafx.experiments.importers.dae;
    exports com.javafx.experiments.importers.max;
    exports com.javafx.experiments.importers.maya;
    exports com.javafx.experiments.importers.obj;
    exports com.javafx.experiments.shape3d;

    uses com.javafx.experiments.importers.Importer;
}
