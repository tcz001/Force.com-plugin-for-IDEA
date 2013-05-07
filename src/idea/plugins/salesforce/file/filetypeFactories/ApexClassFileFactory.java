package idea.plugins.salesforce.file.filetypeFactories;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import idea.plugins.salesforce.file.filetypes.ApexClassFileType;
import org.jetbrains.annotations.NotNull;

public class ApexClassFileFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(ApexClassFileType.INSTANCE);
    }
}
