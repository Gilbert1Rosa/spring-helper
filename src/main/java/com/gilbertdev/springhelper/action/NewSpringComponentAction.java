package com.gilbertdev.springhelper.action;

import com.gilbertdev.springhelper.dialog.NewComponentBaseAction;
import com.gilbertdev.springhelper.dialog.NewSpringComponentDialog;
import com.gilbertdev.springhelper.psi.PsiSpringComponent;
import com.intellij.icons.AllIcons;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.ui.IconManager;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.model.java.JavaModuleSourceRootTypes;

import javax.swing.*;
import java.util.Set;

public class NewSpringComponentAction extends NewComponentBaseAction<PsiSpringComponent> implements DumbAware {

    public NewSpringComponentAction() {
        super("", "Create a new Spring Component",
                AllIcons.FileTypes.JavaClass,
                JavaModuleSourceRootTypes.SOURCES);
    }

    @Override
    protected @Nullable PsiSpringComponent getNavigationElement(@NotNull PsiSpringComponent createdElement) {
        return null;
    }

    @Nullable
    @Override
    protected PsiSpringComponent doCreate(PsiDirectory dir, String className, String templateName) throws IncorrectOperationException {
        return null;
    }

    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory directory, CreateFileFromTemplateDialog.@NotNull Builder builder) {

    }

    @Override
    protected @NlsContexts.Command String getActionName(PsiDirectory directory, @NonNls @NotNull String newName, @NonNls String templateName) {
        return null;
    }
}


