package com.hp.gagawa.elements;

import com.hp.gagawa.FertileNode;
import com.hp.gagawa.Node;

/**
(c) Copyright 2008 Hewlett-Packard Development Company, L.P.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.*/


public class A extends FertileNode {

	/**
	 * 
	 */
	public A(){
		super("a");
	}

	/**
	 * 
	 * @param href href
	 */
	public A(String href){
		this();
		setHref(href);
	}

	/**
	 * 
	 * @param content content
	 */
	public A(Node content){
		this();
		appendChild(content);
	}

	/**
	 * 
	 * @param href href
	 * @param target target
	 */
	public A(String href, String target){
		this(href);
		if(target != null){
			setTarget(target);
		}
	}

	/**
	 * 
	 * @param href href
	 * @param content content
	 */
	public A(String href, Node content){
		this(href);
		appendChild(content);
	}

	/**
	 * 
	 * @param href href
	 * @param target target
	 * @param content content
	 */
	public A(String href, String target, Node content){
		this(href, target);
		appendChild(content);
	}

	/**
	 * 
	 * @param href href
	 * @param target target
	 * @param content content
	 */
	public A(String href, String target, String content){
		this(href,target);
		appendChild(new Text(content));
	}

	/**
	 * 
	 * @param href href
	 * @param target target
	 * @param content content
	 * @param cssClass className
	 */
	public A(String href, String target, String content, String cssClass){
		this(href,target);
		appendChild(new Text(content));
		setCSSClass(cssClass);
	}


	public A setCharset(String value){setAttribute("charset", value); return this;}
	public String getCharset(){return getAttribute("charset");}
	public boolean removeCharset(){return removeAttribute("charset");}

	public A setCoords(String value){setAttribute("coords", value); return this;}
	public String getCoords(){return getAttribute("coords");}
	public boolean removeCoords(){return removeAttribute("coords");}

	public A setHref(String value){setAttribute("href", value); return this;}
	public String getHref(){return getAttribute("href");}
	public boolean removeHref(){return removeAttribute("href");}

	public A setHreflang(String value){setAttribute("hreflang", value); return this;}
	public String getHreflang(){return getAttribute("hreflang");}
	public boolean removeHreflang(){return removeAttribute("hreflang");}

	public A setName(String value){setAttribute("name", value); return this;}
	public String getName(){return getAttribute("name");}
	public boolean removeName(){return removeAttribute("name");}

	public A setRel(String value){setAttribute("rel", value); return this;}
	public String getRel(){return getAttribute("rel");}
	public boolean removeRel(){return removeAttribute("rel");}

	public A setRev(String value){setAttribute("rev", value); return this;}
	public String getRev(){return getAttribute("rev");}
	public boolean removeRev(){return removeAttribute("rev");}

	public A setShape(String value){setAttribute("shape", value); return this;}
	public String getShape(){return getAttribute("shape");}
	public boolean removeShape(){return removeAttribute("shape");}

	public A setTarget(String value){setAttribute("target", value); return this;}
	public String getTarget(){return getAttribute("target");}
	public boolean removeTarget(){return removeAttribute("target");}

	public A setType(String value){setAttribute("type", value); return this;}
	public String getType(){return getAttribute("type");}
	public boolean removeType(){return removeAttribute("type");}

	public A setId(String value){setAttribute("id", value); return this;}
	public String getId(){return getAttribute("id");}
	public boolean removeId(){return removeAttribute("id");}

	public A setCSSClass(String value){setAttribute("class", value); return this;}
	public String getCSSClass(){return getAttribute("class");}
	public boolean removeCSSClass(){return removeAttribute("class");}

	public A setTitle(String value){setAttribute("title", value); return this;}
	public String getTitle(){return getAttribute("title");}
	public boolean removeTitle(){return removeAttribute("title");}

	public A setStyle(String value){setAttribute("style", value); return this;}
	public String getStyle(){return getAttribute("style");}
	public boolean removeStyle(){return removeAttribute("style");}

	public A setDir(String value){setAttribute("dir", value); return this;}
	public String getDir(){return getAttribute("dir");}
	public boolean removeDir(){return removeAttribute("dir");}

	public A setLang(String value){setAttribute("lang", value); return this;}
	public String getLang(){return getAttribute("lang");}
	public boolean removeLang(){return removeAttribute("lang");}

	public A setXMLLang(String value){setAttribute("xml:lang", value); return this;}
	public String getXMLLang(){return getAttribute("xml:lang");}
	public boolean removeXMLLang(){return removeAttribute("xml:lang");}

	public A setTabindex(String value){setAttribute("tabindex", value); return this;}
	public String getTabindex(){return getAttribute("tabindex");}
	public boolean removeTabindex(){return removeAttribute("tabindex");}

	public A setAccesskey(String value){setAttribute("accesskey", value); return this;}
	public String getAccesskey(){return getAttribute("accesskey");}
	public boolean removeAccesskey(){return removeAttribute("accesskey");}

}