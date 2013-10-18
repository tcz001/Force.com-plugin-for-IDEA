package idea.plugins.salesforce.typeFactories;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import idea.plugins.salesforce.file.types.ApexTriggerFileType;
import org.jetbrains.annotations.NotNull;

public class ApexTriggerFileFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(ApexTriggerFileType.INSTANCE);
    }
}
