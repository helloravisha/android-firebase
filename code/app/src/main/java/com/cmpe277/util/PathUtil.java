package com.cmpe277.util;


import com.cmpe277.constants.CommonConstants;


public class PathUtil {

    public static  String getItemPath(){
        StringBuffer itemPath = getRootPath();
        itemPath.append(CommonConstants.ITEMS_PATH);
        itemPath.append(CommonConstants.SEPARATOR);
        return itemPath.toString();
    }

    public static  String getItemIdPath(String itemId){
        StringBuffer itemPath = getRootPath();
        itemPath.append(CommonConstants.ITEMS_PATH);
        itemPath.append(CommonConstants.SEPARATOR);
        itemPath.append(itemId);
        itemPath.append(CommonConstants.SEPARATOR);

        return itemPath.toString();
    }

    public  static StringBuffer getRootPath(){

        StringBuffer rootPath = new StringBuffer();
        rootPath.append(CommonConstants.ROOT_PATH);
        rootPath.append(CommonConstants.SEPARATOR);
        return rootPath;
    }




}
