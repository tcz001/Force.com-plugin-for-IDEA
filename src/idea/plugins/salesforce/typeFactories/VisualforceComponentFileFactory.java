package idea.plugins.salesforce.typeFactories;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import idea.plugins.salesforce.types.VisualforceComponentFileType;
import org.jetbrains.annotations.NotNull;

public class VisualforceComponentFileFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(VisualforceComponentFileType.INSTANCE);
    }
}
