package com.aof.mcinabox.Version;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class AnaliesMinecraftVersionJson {
    //解析version.json
    public ModelMinecraftVersionJson getModelMinecraftVersionJson(String filePath) {
        try {
            //将version.json文件加入输入流
            File file = new File(filePath);
            InputStream inputStream = new FileInputStream(file);
            Reader reader = new InputStreamReader(inputStream);
            Gson gson = new Gson();
            //使用Gson将ModelMinecraftVersionJson实例化
            ModelMinecraftVersionJson modelMinecraftVersionJson = gson.fromJson(reader, ModelMinecraftVersionJson.class);
            return modelMinecraftVersionJson;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
