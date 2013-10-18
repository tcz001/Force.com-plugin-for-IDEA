package idea.plugins.salesforce.typeFactories;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import idea.plugins.salesforce.types.ApexClassFileType;
import org.jetbrains.annotations.NotNull;

public class ApexClassFileFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(ApexClassFileType.INSTANCE);
    }
}
