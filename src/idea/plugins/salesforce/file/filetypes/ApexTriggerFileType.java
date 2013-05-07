package idea.plugins.salesforce.file.filetypes;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;


public class ApexTriggerFileType implements FileType {
    public static final ApexTriggerFileType INSTANCE = new ApexTriggerFileType();
    /**
     * Returns the name of the file type. The name must be unique among all file types registered in the system.
     *
     * @return The file type name.
     */
    @NotNull
    @Override
    public String getName() {
        return "Apex Trigger";  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns the user-readable description of the file type.
     *
     * @return The file type description.
     */
    @NotNull
    @Override
    public String getDescription() {
        return "Salesforce Apex Trigger";  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns the default extension for files of the type.
     *
     * @return The extension, not including the leading '.'.
     */
    @NotNull
    @Override
    public String getDefaultExtension() {
        return "apexTrigger";  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns the icon used for showing files of the type.
     *
     * @return The icon instance, or null if no icon should be shown.
     */
    @Nullable
    @Override
    public Icon getIcon() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns true if files of the specified type contain binary data. Used for source control, to-do items scanning and other purposes.
     *
     * @return true if the file is binary, false if the file is plain text.
     */
    @Override
    public boolean isBinary() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns true if the specified file type is read-only. Read-only file types are not shown in the "File Types" settings dialog,
     * and users cannot change the extensions associated with the file type.
     *
     * @return true if the file type is read-only, false otherwise.
     */
    @Override
    public boolean isReadOnly() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * Returns the character set for the specified file.
     *
     * @param file    The file for which the character set is requested.
     * @param content
     * @return The character set name, in the format supported by {@link java.nio.charset.Charset} class.
     */
    @Nullable
    @Override
    public String getCharset(@NotNull VirtualFile file, byte[] content) {
        return CharsetToolkit.UTF8;  //To change body of implemented methods use File | Settings | File Templates.
    }
}