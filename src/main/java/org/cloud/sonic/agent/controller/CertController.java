/*
 *   sonic-agent  Agent of Sonic Cloud Real Machine Platform.
 *   Copyright (C) 2022 SonicCloudOrg
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero General Public License as published
 *   by the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   You should have received a copy of the GNU Affero General Public License
 *   along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.cloud.sonic.agent.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhouYiXun
 * @des 证书下载页
 * @date 2022/3/10 23:04
 */
@Controller
public class CertController {
    @Value("${sonic.sgm}")
    private String version;

    @RequestMapping("/assets/download")
    public String download(Model model) {
        model.addAttribute("msg", "欢迎来到证书下载页面");
        model.addAttribute("pemMsg", "👉 点击下载pem证书");
        model.addAttribute("pemName", "sonic-go-mitmproxy-ca-cert.pem");
        model.addAttribute("pemUrl", "/download/sonic-go-mitmproxy-ca-cert.pem");
        model.addAttribute("tips", "如果pem证书无效，请尝试cer证书");
        model.addAttribute("cerMsg", "👉 点击下载cer证书");
        model.addAttribute("cerName", "sonic-go-mitmproxy-ca-cert.cer");
        model.addAttribute("cerUrl", "/download/sonic-go-mitmproxy-ca-cert.cer");
        model.addAttribute("version", "Version: " + version);

        return "download";
    }
}
