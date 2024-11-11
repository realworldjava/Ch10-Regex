package com.wiley.realworldjava.regex.noregex;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class UsingGlobs {

    public void findByGlob(Path path) throws IOException {
        try (DirectoryStream<Path> dStream = Files.newDirectoryStream(path, "*.{properties,txt}")) {

        }
    }
}
