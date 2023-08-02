package com.gilbertdev.springhelper.dialog;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class NewSpringComponentDialog extends DialogWrapper {
    public NewSpringComponentDialog(@Nullable Project project) {
        super(project, true);
        setTitle("New Spring Component");
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        return createMainPanel();
    }

    private JComponent createMainPanel() {
        JPanel mainPanel = new JPanel();

        JLabel label = new JLabel("testing");
        label.setPreferredSize(new Dimension(100, 100));
        mainPanel.add(label, BorderLayout.CENTER);

        return mainPanel;
    }
}
