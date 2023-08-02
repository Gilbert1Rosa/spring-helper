package com.gilbertdev.springhelper.dialog;

import com.gilbertdev.springhelper.util.PackageUtil;
import com.intellij.ide.actions.CreateTemplateInPackageAction;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jps.model.module.JpsModuleSourceRootType;

import javax.swing.*;
import java.util.Set;

public abstract class NewComponentBaseAction<T extends PsiElement> extends CreateTemplateInPackageAction<T> {
    protected NewComponentBaseAction(String text, String description, Icon icon, Set<? extends JpsModuleSourceRootType<?>> rootTypes) {
        super(text, description, icon, rootTypes);
    }

    @Override
    protected boolean checkPackageExists(PsiDirectory directory) {
        return PackageUtil.isPackage(directory);
    }

    @Override
    protected @Nullable T createFile(String name, String templateName, PsiDirectory dir) {
        return super.createFile(name, templateName, dir);
    }
}
